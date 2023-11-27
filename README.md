<div align="center">
    <h1>:star: Travel Manager :star:</h1>
</div>

<div align="center">

The ***travel-manager-api*** is a Rest API made with Java, SpringBoot and Postgres for travel management.
</div>

## :rocket: Technology

<div align="center">

```sh
Platform: JVM
Build System: Gradle
Java Version: 19
```

![java](https://img.shields.io/badge/java-ba0c0c?&logoColor=fff&style=for-the-badge&logo=java)
![gradle](https://img.shields.io/badge/gradle-157a13?&logoColor=fff&style=for-the-badge&logo=gradle)

</div>

## :boom: How to run

- ### **Prerequisites**

    - Make sure you have Java 19 installed in your machine.

## :hammer: Application

### Clone the repository:

```sh
# SSH
  $ git@github.com:gloureirogomes/travel-manager-api.git
```

### Build the application

Create the `.env` file and put the environment variable with your values:

```
DB_USERNAME
DB_PASSWORD
```

After setting up your environment, up the docker container: 

```sh
  $ make compose-up
```

### Run the application

```sh
  $ make run
```