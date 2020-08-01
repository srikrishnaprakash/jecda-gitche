#!/usr/bin/env groovy
// vars/fsjob.groovy

import com.rautomates.seedjob.model.JobDVO

def call(JobDVO dataJDVO) {
	println("Success. ")
	folder (dataJDVO.accountName) {
		
	}

}
