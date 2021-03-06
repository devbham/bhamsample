binaryRepository {
    baseUrl = 'http://localhost:8081/artifactory'
	//releaseUrl = "$baseUrl/libs-release-local"
	releaseUrl = "$baseUrl/bham"
    username = 'deployer'
    password = 'Akacity77'
	repositoryName = 'bham-local'
}

environments {
    test { 
        server {
            hostname = 'localhost'
            sshPort = 22
            port = 8099
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    uat {
        server {
            hostname = 'localhost'
            sshPort = 22
            port = 8199
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    production {
        server {
            hostname = 'localhost'
            sshPort = 22
            port = 8299
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }
}