# Module 13 – Containerization using Docker 


# 1. Introduction to Docker

## What is Docker?

Docker is an open-source platform that allows developers to package applications and their dependencies into lightweight containers.

A **container** is a package that contains:

- Application code
- Runtime environment
- Libraries
- Dependencies
- Configuration files


### Real-World Example

Imagine a Java application.

Without Docker:

```
Application
    |
    ↓
Install Java
    |
    ↓
Install Database
    |
    ↓
Configure Environment
```

Different systems may have different configurations.


With Docker:

```
Docker Container

--------------------
| Java Application |
| Java Runtime     |
| Dependencies     |
| Configuration    |
--------------------
```

The application runs the same way everywhere.


---

# 2. Docker Architecture

Docker follows a client-server architecture.


```
Docker Client
      |
      |
 Docker REST API
      |
      |
 Docker Daemon
      |
      |
 Containers + Images
```


Components:

| Component | Purpose |
|---|---|
| Docker Client | User interface to communicate with Docker |
| Docker Daemon | Creates and manages containers |
| Docker Images | Templates used to create containers |
| Containers | Running instances of images |


---

# 3. Docker Commands

Docker provides commands to manage images and containers.


## 3.1 docker run

Creates and starts a container.

Syntax:

```
docker run <image-name>
```

Example:

```
docker run nginx
```

Runs an Nginx container.


---

## 3.2 docker ps

Displays running containers.

Command:

```
docker ps
```


Show all containers:

```
docker ps -a
```


---

## 3.3 docker stop

Stops a running container.

Syntax:

```
docker stop <container-id>
```

Example:

```
docker stop abc123
```


---

## 3.4 docker rm

Removes a stopped container.

Example:

```
docker rm container_id
```


---

## 3.5 docker images

Lists all Docker images.

Command:

```
docker images
```


---

## 3.6 docker rmi

Removes Docker images.

Example:

```
docker rmi image_name
```


---

## 3.7 docker pull

Downloads an image from Docker Hub.

Example:

```
docker pull mysql
```


---

## 3.8 docker exec

Runs a command inside a running container.

Example:

```
docker exec -it container_id bash
```


Used for accessing the container terminal.


---

# 4. Docker Run Command

The `docker run` command is used to create and start containers.


## Basic Usage

```
docker run image_name
```


Example:

```
docker run ubuntu
```


---

## Run Container With Specific Name

Command:

```
docker run --name mycontainer nginx
```


Here:

```
mycontainer → Container name
nginx → Image name
```


---

## Run Container in Background (Detached Mode)

Use `-d`.

Example:

```
docker run -d nginx
```


The container runs in the background.


---

## Run Container Interactively

Use `-it`.

Example:

```
docker run -it ubuntu bash
```


Allows users to interact with the container terminal.


---

## Publish Container Ports

Used to connect container applications with outside users.

Syntax:

```
docker run -p host_port:container_port image
```


Example:

```
docker run -p 8080:80 nginx
```


Meaning:

```
localhost:8080
        |
        ↓
Container Port 80
```


---

## Remove Container Automatically

Use `--rm`.

Example:

```
docker run --rm ubuntu
```


The container is deleted after completion.


---

# 5. Docker Images

## What is a Docker Image?

A Docker image is a read-only template used to create containers.


Example:

```
Docker Image

       ↓

Docker Container
```


Examples of images:

- Ubuntu
- MySQL
- Node.js
- Nginx


---

# Image Layers

Docker images are created using multiple layers.

Example:

```
Application Layer
-----------------
Library Layer
-----------------
Runtime Layer
-----------------
Base OS Layer
```


Benefits:

- Faster downloads
- Saves storage space
- Easy version management


---

# Container Layer

The container layer is the writable layer created when a container runs.


Image:

```
Read Only Layers
       +
Writable Container Layer
```


---

# Parent Image

A parent image is an image used as the foundation for creating another image.


Example:

```
Java Image
     |
     ↓
Spring Boot Application Image
```


---

# Base Image

A base image is the starting image used to build a Docker image.

Examples:

- Ubuntu
- Alpine Linux
- Java


---

# Docker Manifest

A Docker manifest contains information about an image.

It includes:

- Image version
- Architecture
- Layers


---

# Container Registry

A container registry stores Docker images.

Examples:

- Docker Hub
- Amazon ECR
- Google Container Registry


---

# Container Repository

A repository stores different versions of Docker images.

Example:

```
Repository: nginx

Versions:
nginx:latest
nginx:1.25
nginx:1.26
```


---

# 6. Creating Docker Images


## Method 1: Interactive Method

Steps:

1. Run a container
2. Make changes
3. Save changes as an image


Command:

```
docker commit container_id new_image
```


---

## Method 2: Dockerfile Method

Dockerfile is a file containing instructions to create an image.


Example:

```dockerfile
FROM node:18

WORKDIR /app

COPY . .

RUN npm install

CMD ["npm","start"]
```


Build image:

```
docker build -t myapp .
```


Run image:

```
docker run myapp
```


---

# Docker Build Context

Docker build context contains files required to build an image.

Example:

```
Project Folder

 ├── Dockerfile
 ├── package.json
 └── source files
```


Docker uses this folder while creating an image.


---

# 7. Docker Compose

## What is Docker Compose?

Docker Compose is a tool used to manage multiple containers using a single configuration file.


Example:

A web application may need:

```
Frontend Container
        +
Backend Container
        +
Database Container
```


Docker Compose manages all together.


---

# Benefits of Docker Compose

- Easy multi-container management
- Simple configuration
- Faster deployment
- Reproducible environments


---

# Docker Compose File

Docker Compose uses a YAML file:

```
docker-compose.yml
```


Example:

```yaml
version: "3"

services:

  database:
    image: mysql

  app:
    image: myapp
    ports:
      - "8080:8080"
```


---

# Docker Compose Commands


Start services:

```
docker compose up
```


Stop services:

```
docker compose down
```


View containers:

```
docker compose ps
```


---

# 8. Docker Engine

Docker Engine is the core component responsible for creating and managing containers.


It contains:


## Docker CLI

Command-line interface used by users.

Example:

```
docker run nginx
```


---

## REST API

Allows applications to communicate with Docker.


---

## Docker Daemon

Background service that manages:

- Containers
- Images
- Networks
- Storage


---

# 9. Docker Storage


Containers are temporary. Data can be stored using Docker storage.


## Storage Drivers

Storage drivers manage how Docker stores image and container data.


Examples:

- overlay2
- aufs


---

# Data Volumes

Volumes are used to store persistent data.

Example:

Database data should not disappear when containers stop.


Create volume:

```
docker volume create myvolume
```


List volumes:

```
docker volume ls
```


---

# Changing Storage Driver

Docker storage driver can be changed using Docker configuration settings.


---

# 10. Docker Networking


Docker networking allows containers to communicate with each other.


## Default Networks

Docker provides:

### Bridge Network

Default network for containers.


### Host Network

Container uses host machine network.


### None Network

No network access.


---

# List Docker Networks

Command:

```
docker network ls
```


---

# Inspect Docker Network

Command:

```
docker network inspect network_name
```


---

# Create Custom Network

Command:

```
docker network create mynetwork
```


Containers in the same network can communicate.


---

# 11. Container Orchestration


## What is Container Orchestration?

Container orchestration is the process of automatically managing large numbers of containers.


It handles:

- Deployment
- Scaling
- Networking
- Monitoring
- Availability


---

# Why Do We Need Container Orchestration?

Managing hundreds of containers manually is difficult.


Example:

A large application may have:

```
100 Backend Containers
50 Database Containers
20 Frontend Containers
```


Orchestration manages them automatically.


---

# Benefits of Container Orchestration

## 1. Automatic Scaling

Adds or removes containers based on demand.


## 2. High Availability

Restarts failed containers automatically.


## 3. Load Balancing

Distributes traffic between containers.


## 4. Easy Deployment

Automates application updates.


---

# Kubernetes Container Orchestration

Kubernetes is an open-source container orchestration platform.


Features:

- Automatic scaling
- Self-healing
- Load balancing
- Rolling updates


Kubernetes Architecture:

```
Master Node

    |
    ↓

Worker Nodes

    |
    ↓

Containers
```


---

# Container Orchestration vs Docker

| Docker | Container Orchestration |
|---|---|
| Creates and runs containers | Manages multiple containers |
| Works on individual containers | Works on large applications |
| Example: Docker Engine | Example: Kubernetes |


---

# 12. Interview Questions


### 1. What is Docker?

Docker is a platform used to create and run applications inside containers.


### 2. Difference between Image and Container?

Image is a blueprint, while a container is a running instance of an image.


### 3. What is Dockerfile?

Dockerfile contains instructions to create a Docker image.


### 4. What is Docker Compose?

Docker Compose manages multiple containers using a YAML configuration file.


### 5. What is Kubernetes?

Kubernetes is a container orchestration platform used to manage containers at scale.



