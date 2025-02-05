package org.dhorse.api.response.model;

import org.dhorse.api.response.model.App.AppExtend;

public class AppExtendNode extends AppExtend {

	private static final long serialVersionUID = 1L;

	/**
	 * node版本
	 */
	private String nodeVersion;

	/**
	 * npm版本
	 */
	private String npmVersion;

	/**
	 * 文件路径
	 */
	private String packageTargetPath;

	public String getNodeVersion() {
		return nodeVersion;
	}

	public void setNodeVersion(String nodeVersion) {
		this.nodeVersion = nodeVersion;
	}

	public String getNpmVersion() {
		return npmVersion;
	}

	public void setNpmVersion(String npmVersion) {
		this.npmVersion = npmVersion;
	}

	public String getPackageTargetPath() {
		return packageTargetPath;
	}

	public void setPackageTargetPath(String packageTargetPath) {
		this.packageTargetPath = packageTargetPath;
	}

}