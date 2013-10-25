# SBT-Scalatra skeleton

## Features

* Scala 2.10
* Scalatra 2.2.0
* SBT IDEA 1.3.0

## Usage

    # Start the web server and reload it on file change
    ./sbt "~;container:start; container:reload /"

Let's curl!

    curl localhost:8080

## Generate the IDEA project files

    ./sbt gen-idea

## Tests

    ./sbt test
