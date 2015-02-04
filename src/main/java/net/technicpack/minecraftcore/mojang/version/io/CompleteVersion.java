/*
 * This file is part of Technic Minecraft Core.
 * Copyright ©2015 Syndicate, LLC
 *
 * Technic Minecraft Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Technic Minecraft Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * as well as a copy of the GNU Lesser General Public License,
 * along with Technic Minecraft Core.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.technicpack.minecraftcore.mojang.version.io;

import net.technicpack.minecraftcore.mojang.version.MojangVersion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompleteVersion implements MojangVersion {

	private String id;
	private Date time;
	private Date releaseTime;
	private ReleaseType type;
	private String minecraftArguments;
    private String javaArguments;
	private List<Library> libraries;
	private String mainClass;
	private int minimumLauncherVersion;
	private String incompatibilityReason;
	private List<Rule> rules;
	private String assets;
    private String jar;
    private String inheritsFrom;
	private transient boolean areAssetsVirtual;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public ReleaseType getType() {
		return type;
	}

	@Override
	public void setType(ReleaseType type) {
		this.type = type;
	}

	@Override
	public Date getUpdatedTime() {
		return time;
	}

	@Override
	public void setUpdatedTime(Date updatedTime) {
		this.time = updatedTime;
	}

	@Override
	public Date getReleaseTime() {
		return releaseTime;
	}

	@Override
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

    @Override
	public String getMinecraftArguments() {
		return minecraftArguments;
	}

    @Override
    public String getJavaArguments() { return javaArguments; }

    @Override
	public List<Library> getLibraries() {
		return libraries;
	}

    @Override
	public List<Library> getLibrariesForOS() {
		List<Library> libraryList = new ArrayList<Library>(libraries.size());
		for (Library library : libraries) {
			if (library.isForCurrentOS()) {
				libraryList.add(library);
			}
		}
		return libraryList;
	}

    @Override
	public String getMainClass() {
		return mainClass;
	}

    @Override
	public int getMinimumLauncherVersion() {
		return minimumLauncherVersion;
	}

    @Override
	public String getIncompatibilityReason() {
		return incompatibilityReason;
	}

    @Override
	public List<Rule> getRules() {
		return rules;
	}

    @Override
	public String getAssetsKey() {
		return assets;
	}

    @Override
    public String getJarKey() { return jar; }

    @Override
    public String getParentVersion() { return inheritsFrom; }

    @Override
	public boolean getAreAssetsVirtual() {
		return areAssetsVirtual;
	}

    @Override
	public void setAreAssetsVirtual(boolean areAssetsVirtual) {
		this.areAssetsVirtual = areAssetsVirtual;
	}

	@Override
	public String toString() {
		return "CompleteVersion{" +
				"id='" + id + '\'' +
				", time=" + time +
				", releaseTime=" + releaseTime +
				", type=" + type +
				", minecraftArguments='" + minecraftArguments + '\'' +
				", libraries=" + libraries +
				", mainClass='" + mainClass + '\'' +
				", minimumLauncherVersion=" + minimumLauncherVersion +
				", incompatibilityReason='" + incompatibilityReason + '\'' +
				", rules=" + rules +
				'}';
	}
}
