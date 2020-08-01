/**
 * This script clones the application code. The branch/revision name is also a parameter 
 */

import deop.rautomates.jecda.common.util.JECDAConstants

/**
 * @author vibhu
 *
 */
def call (data) {
	node (data.getAt(JECDAConstants.NODENAME)?:JECDAConstants.DEFAULT_NODE) {
		stage(JECDAConstants.APCOCL) {
			git(
				url: data[JECDAConstants.APPURL],
				credentialsId: data[JECDAConstants.GHCRED],
				branch: data[JECDAConstants.APPREV]
			)
		}
	}
}