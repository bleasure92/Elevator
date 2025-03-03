These instructions are for a Ubuntu distribution ran from WSL

Installs
`sudo apt update`
`sudo apt install openjdk-21-jdk`
`sudo apt install maven`

Packaging
    From the top directory, run `mvn package`

To run the application
    `java -cp target/elevator-app-1.0-SNAPSHOT.jar com.elevator.app.App`

Unimplemented features:
- building
- max capacity
- other occupants
- emergency stops