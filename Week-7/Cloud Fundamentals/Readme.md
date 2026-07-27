# Module 15 – Cloud Fundamentals 

# 1. Introduction to Cloud Computing


## What is Cloud Computing?

Cloud Computing provides on-demand access to IT resources through the internet.

Resources include:

- Servers
- Storage
- Databases
- Networking
- Software


### Real-World Example

Instead of buying a physical server:

```
Traditional Approach:

Company
   |
   ↓
Buy Server
   |
   ↓
Install Software
   |
   ↓
Maintain Hardware
```


Cloud Approach:

```
Company

   |
   ↓

Cloud Provider

   |
   ↓

Virtual Servers + Storage + Database
```


---

# 2. Traditional IT Deployment vs Cloud Computing


## Traditional IT Deployment

Companies manage their own:

- Hardware
- Servers
- Networking
- Maintenance


Problems:

- High cost
- Requires physical space
- Difficult scaling
- Manual maintenance


---

## Cloud Computing

Cloud providers manage infrastructure.

Benefits:

- Pay only for usage
- Easy scaling
- High availability
- Global access


---

# 3. Virtualization Concepts


## What is Virtualization?

Virtualization is the process of creating virtual versions of physical resources.


Example:

One physical server can run multiple virtual machines.


```
Physical Server

        |
        |
 Hypervisor

 ----------------

 VM 1
 VM 2
 VM 3
```


Benefits:

- Better resource utilization
- Cost reduction
- Easy management


---

# 4. Service-Oriented Architecture (SOA)


## What is SOA?

Service-Oriented Architecture is a software design approach where applications are built using independent services.


Example:

E-commerce Application:


```
User Service

Payment Service

Order Service

Product Service
```


Each service performs a specific function.


---

# 5. Cloud vs On-Premises


| Cloud | On-Premises |
|---|---|
| Hosted by cloud provider | Hosted by company |
| Lower initial cost | High hardware cost |
| Easily scalable | Limited scalability |
| Maintenance by provider | Company manages everything |
| Pay-as-you-go | Fixed investment |


---

# 6. Cloud Service Models


Cloud services are divided into three categories:


# 6.1 Infrastructure as a Service (IaaS)

IaaS provides virtual infrastructure.

Includes:

- Virtual machines
- Storage
- Networks


Examples:

- Amazon EC2
- Google Compute Engine
- Azure Virtual Machines


User manages:

- Applications
- Data
- Operating system


---

# 6.2 Platform as a Service (PaaS)

PaaS provides a platform for developing applications.

Developers focus only on code.


Examples:

- AWS Elastic Beanstalk
- Google App Engine


Benefits:

- No server management
- Faster development


---

# 6.3 Software as a Service (SaaS)

SaaS provides ready-to-use software through the internet.


Examples:

- Gmail
- Microsoft Office 365
- Salesforce


---

# 7. Cloud Deployment Models


## Public Cloud

Resources are shared among multiple customers.


Examples:

- AWS
- Azure
- Google Cloud


---

## Private Cloud

Cloud infrastructure is dedicated to one organization.


Used by:

- Banks
- Government organizations


---

## Hybrid Cloud

Combination of public and private cloud.


Example:

```
Private Cloud
     +
Public Cloud
```


---

## Community Cloud

Cloud shared by organizations with common goals.


Example:

Healthcare organizations sharing infrastructure.


---

# 8. Cloud Service Providers


Popular cloud providers:


| Provider | Platform |
|---|---|
| Amazon | AWS |
| Microsoft | Azure |
| Google | Google Cloud Platform |


---

# 9. Amazon EC2 (Elastic Compute Cloud)


## What is EC2?

Amazon EC2 provides virtual servers in the cloud.

Users can:

- Launch servers
- Install applications
- Configure security


Example:

Running a web application on an EC2 instance.


---

# EC2 Instance


An EC2 instance is a virtual machine running in AWS.


Example:

```
EC2 Instance

----------------

Operating System

Application

Libraries

----------------
```


---

# Launching EC2 Instance


Steps:

1. Open AWS Console
2. Select EC2
3. Click Launch Instance
4. Select AMI
5. Choose Instance Type
6. Configure Security Group
7. Create Key Pair
8. Launch


---

# Amazon Machine Image (AMI)


## What is AMI?

AMI is a template used to create EC2 instances.


It contains:

- Operating system
- Software
- Configurations


Example:

```
AMI

 ↓

EC2 Instance
```


---

# EC2 Instance Types


Examples:


## t2.micro

Used for:

- Learning
- Testing
- Small applications


Other types:

| Type | Usage |
|---|---|
| General Purpose | Balanced workload |
| Compute Optimized | CPU intensive tasks |
| Memory Optimized | Large memory applications |


---

# Security Groups


Security Group acts as a virtual firewall for EC2.


Controls:

- Incoming traffic
- Outgoing traffic


Example:

Inbound Rule:

```
Allow HTTP Port 80
Allow SSH Port 22
```


---

# Key Pairs


Key pairs are used for secure login into EC2.


Contains:

- Public key
- Private key (.pem file)


Example SSH connection:


```
ssh -i key.pem username@ip-address
```


---

# 10. Amazon ECS (Elastic Container Service)


## What is ECS?

Amazon ECS is a service used to run and manage Docker containers.


Example:

```
Docker Container

        ↓

Amazon ECS

        ↓

AWS Infrastructure
```


---

# Docker vs ECS vs EC2


| Docker | ECS | EC2 |
|---|---|---|
| Creates containers | Manages containers | Provides virtual servers |
| Runs applications | Orchestrates containers | Runs operating systems |


---

# 11. Amazon S3 (Simple Storage Service)


## What is S3?

Amazon S3 is an object storage service used to store files.


Examples:

- Images
- Videos
- Documents
- Backups


---

# S3 Concepts


## Bucket

A bucket is a container used to store objects.


Example:

```
Bucket

 |
 |-- image.jpg
 |-- resume.pdf
 |-- video.mp4
```


---

## Object

An object is the actual file stored inside a bucket.


---

# S3 Storage Classes


| Storage Class | Usage |
|---|---|
| Standard | Frequently accessed data |
| Intelligent Tiering | Automatically optimizes cost |
| Standard-IA | Infrequent access |
| Glacier | Long-term archive |


---

# S3 Versioning

Versioning keeps multiple versions of objects.


Example:

```
document.pdf

Version 1

Version 2

Version 3
```


---

# 12. Amazon EBS (Elastic Block Store)


## What is EBS?

EBS provides block storage for EC2 instances.


Example:

```
EC2 Instance

      |

      |

EBS Volume
```


---

# EBS Volume Types


| Type | Usage |
|---|---|
| gp2 | General purpose |
| gp3 | Improved performance |
| io1 | High performance applications |


---

# Snapshots

Snapshots create backups of EBS volumes.


Benefits:

- Data recovery
- Backup
- Migration


---

# 13. Amazon VPC (Virtual Private Cloud)


## What is VPC?

VPC is a private network inside AWS where resources run securely.


Example:


```
AWS Cloud

   |

  VPC

 ----------------

 EC2

 Database

 Storage

```


---

# Subnets


A subnet divides a VPC into smaller networks.


## Public Subnet

Accessible from internet.


## Private Subnet

Not directly accessible from internet.


---

# Route Tables


Route tables control traffic flow.


Example:

```
Subnet

  ↓

Route Table

  ↓

Internet Gateway
```


---

# Internet Gateway

Allows communication between VPC and internet.


---

# NAT Gateway

Allows private resources to access internet securely.


---

# VPC Peering

Connects two VPC networks.


Example:

```
VPC A

  |

  |

VPC B
```


---

# 14. Elastic Load Balancer


## What is Load Balancing?

Load balancing distributes incoming traffic across multiple servers.


Example:


```
Users

 |

Load Balancer

 |

----------------

Server 1

Server 2

Server 3

```


---

# Application Load Balancer (ALB)

Works at Layer 7.


Supports:

- HTTP
- HTTPS
- Path-based routing


Example:

```
/users → User Service

/products → Product Service
```


---

# Network Load Balancer (NLB)

Works at Layer 4.


Supports:

- TCP
- UDP

Used for:

- High performance applications


---

# ALB vs NLB


| ALB | NLB |
|---|---|
| Layer 7 | Layer 4 |
| HTTP/HTTPS | TCP/UDP |
| Application routing | High performance |


---
# 15. Amazon RDS (Relational Database Service)


## What is Amazon RDS?

Amazon RDS is a managed database service provided by AWS.

It allows users to create and manage relational databases without handling server maintenance.


AWS manages:

- Hardware
- Database installation
- Software updates
- Backups
- Security patches


---

# Managed Database vs Self-Managed Database


## Self-Managed Database

The user manages:

- Server
- Installation
- Updates
- Backup
- Security


Example:

Installing MySQL on an EC2 server.


---

## Managed Database (RDS)

AWS manages:

- Infrastructure
- Maintenance
- Backups
- Scaling


Example:

Creating a MySQL database directly using Amazon RDS.


---

# Supported Database Engines


Amazon RDS supports:


| Database | Description |
|---|---|
| MySQL | Popular open-source relational database |
| PostgreSQL | Advanced open-source database |
| SQL Server | Microsoft database |
| Oracle | Enterprise database |
| Aurora | AWS high-performance database |


---

# Creating an RDS Database


Steps:

1. Open AWS Console
2. Select RDS
3. Click Create Database
4. Select Database Engine
5. Configure Database Settings
6. Select Instance Size
7. Configure Security
8. Create Database


---

# Multi-AZ Deployment


## What is Multi-AZ?

Multi-AZ creates a standby database in another Availability Zone.


Architecture:


```
Primary Database

       |

       |

Automatic Replication

       |

       |

Standby Database
```


Benefits:

- High availability
- Automatic failover
- Disaster recovery


---

# RDS Backups and Snapshots


## Automated Backups

AWS automatically creates backups.


Used for:

- Recovery
- Data restoration


---

## Snapshots

A manual backup created by the user.


Example:

Before changing database configuration:

```
Create Snapshot

      ↓

Modify Database
```


---

# 16. Amazon DynamoDB (NoSQL Database)


## What is DynamoDB?

Amazon DynamoDB is a fully managed NoSQL database service.

It provides:

- Fast performance
- High scalability
- Low latency


Used for applications requiring millions of requests.


---

# SQL Database vs NoSQL Database


| SQL (RDS) | NoSQL (DynamoDB) |
|---|---|
| Relational database | Non-relational database |
| Uses tables | Uses items and attributes |
| Fixed schema | Flexible schema |
| Uses SQL queries | Key-value/document queries |


---

# DynamoDB Data Model


DynamoDB stores data as:


```
Table

 |
 |-- Item

      |
      |-- Attributes
```


Example:


User Table:


| UserID | Name | Age |
|---|---|---|
| 101 | Sivani | 20 |


---

# Primary Keys


DynamoDB supports:


## 1. Partition Key


Unique identifier for data.


Example:

```
User_ID
```


---

## 2. Sort Key


Used to organize related items.


Example:

```
Order_Date
```


Together:


```
Partition Key + Sort Key
```

creates a unique record.


---

# DynamoDB Operations


## Query

Retrieves data using keys.


Example:

Find user by User_ID.


---

## Scan

Reads the entire table.


Used when:

- Searching multiple records
- Filtering data


---

# DynamoDB Use Cases


Used in:

- Gaming applications
- IoT systems
- Real-time applications
- Shopping platforms


---

# 17. AWS Lambda (Serverless Computing)


## What is Serverless Computing?


Serverless computing allows developers to run code without managing servers.


The cloud provider manages:

- Servers
- Scaling
- Infrastructure


---

# What is AWS Lambda?


AWS Lambda runs code automatically when an event occurs.


Example:


```
User uploads image

        ↓

S3 Event Trigger

        ↓

Lambda Function

        ↓

Process Image
```


---

# Lambda Execution Model


```
Event

 ↓

Lambda Function

 ↓

Execution

 ↓

Response
```


---

# Lambda Supported Languages


AWS Lambda supports:


- Java
- Python
- Node.js
- C#
- Go


---

# Lambda Triggers


Lambda can be triggered by:


## 1. Amazon S3

Example:

When a file is uploaded.


## 2. API Gateway

Example:

When an API request arrives.


## 3. DynamoDB Streams

Example:

When database data changes.


---

# Creating Lambda Function


Steps:

1. Open AWS Lambda Console
2. Click Create Function
3. Select Runtime
4. Write Code
5. Configure Trigger
6. Deploy


---

# Lambda Pricing Model


Lambda follows:

## Pay-per-execution model


You pay only when:

- Function runs
- Computing resources are used


Benefits:

- Cost efficient
- Automatic scaling


---

# Lambda Integration Example


Serverless Application:


```
User

 ↓

API Gateway

 ↓

Lambda Function

 ↓

DynamoDB

```


---

# 18. AWS API Gateway


## What is API Gateway?


AWS API Gateway is a service used to create, publish, manage, and secure APIs.


It acts as a connection between:

```
Client

 ↓

API Gateway

 ↓

Backend Service
```


Backend services can be:

- Lambda
- EC2
- Other AWS services


---

# Features of API Gateway


## 1. API Creation

Developers can create REST APIs and HTTP APIs.


---

## 2. Request Routing

Routes client requests to correct backend services.


Example:


```
GET /users

        ↓

User Lambda Function
```


---

## 3. Security

Provides:

- Authentication
- Authorization
- API keys


---

## 4. Throttling


Controls the number of API requests.


Example:

```
Maximum 1000 requests/minute
```


Prevents system overload.


---

# Creating REST API using API Gateway


Steps:


1. Open API Gateway Console

2. Select REST API

3. Create API

4. Create Resources

5. Define HTTP Methods


Example:


```
/users

GET

POST
```


6. Connect Backend


Example:


```
API Gateway

       |

       |

Lambda Function
```


7. Deploy API


---

# HTTP Methods in API Gateway


| Method | Purpose |
|---|---|
| GET | Retrieve data |
| POST | Create data |
| PUT | Update data |
| DELETE | Remove data |


---

# Deployment Stages


API Gateway supports different environments:


## Development

Used for testing.


Example:

```
dev
```


## Staging

Used before production.


Example:

```
staging
```


## Production

Used by real users.


Example:

```
prod
```


---

# API Gateway + Lambda Architecture


```
Client Request

      |

      ↓

API Gateway

      |

      ↓

Lambda Function

      |

      ↓

Database
```


---

# 19. AWS Cloud Architecture Example


Complete Application:


```
Users

 |

Elastic Load Balancer

 |

EC2 / ECS

 |

RDS Database

 |

S3 Storage

```


Serverless Architecture:


```
Users

 |

API Gateway

 |

Lambda

 |

DynamoDB

```


---

# 20. Important AWS Services Summary


| Service | Purpose |
|---|---|
| EC2 | Virtual Servers |
| ECS | Container Management |
| S3 | Object Storage |
| EBS | Block Storage |
| VPC | Private Network |
| ELB | Traffic Distribution |
| RDS | Relational Database |
| DynamoDB | NoSQL Database |
| Lambda | Serverless Computing |
| API Gateway | API Management |


---

#
