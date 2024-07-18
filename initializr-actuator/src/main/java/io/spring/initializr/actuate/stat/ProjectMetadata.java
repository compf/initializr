/*
 * Copyright 2012-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.spring.initializr.actuate.stat;

public class ProjectMetadata {

	private String type;

	private String groupId;

	private String artifactId;

	private String javaVersion;

	private String language;

	private String packaging;

	private String packageName;

	public String getType() {
		return type;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public String getLanguage() {
		return language;
	}

	public String getPackaging() {
		return packaging;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public ProjectMetadata(String type, String groupId, String artifactId, String javaVersion, String language,
			String packaging, String packageName) {
		this.type = type;
		this.groupId = groupId;
		this.artifactId = artifactId;
		this.javaVersion = javaVersion;
		this.language = language;
		this.packaging = packaging;
		this.packageName = packageName;
	}

}
