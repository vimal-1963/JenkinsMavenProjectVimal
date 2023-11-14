pipeline {

    agent any
 
    tools {

        // Install the Maven version configured as "M3" and add it to the path.

        maven "Maven3"

    }
 
    stages {

        stage('Build') {

            steps {

                // Get some code from a GitHub repository

               // git 'https://github.com/jglick/simple-maven-project-with-tests.git'

                git branch: 'main', url: 'https://github.com/vimal-1963/JenkinsMavenProjectVimal.git'

                // Run Maven on a Unix agent.

              //  sh "mvn -Dmaven.test.failure.ignore=true clean package"
 
                // To run Maven on a Windows agent, use

                 bat "mvn clean package"

            }

        }

		stage('Docker Build Vimal') {

            steps{

                script{

                    bat "docker build -t vimal96/vimaljenkinsmavenproject ."

                }

            }

        }

		    stage('Docker Login Vimal'){

            steps{

                script{

                    withCredentials([usernamePassword(credentialsId: 'dockerhub_id', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {

                    bat "docker login --username ${USERNAME} --password ${PASSWORD}"

                    }

                }

            }

  		}

  		stage('DockerHub Push Vimal'){

            steps{

                script{

                    bat "docker push vimal96/vimaljenkinsmavenproject"

                }

            }

  		}

	}


    }
 