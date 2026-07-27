# Module 12 – DevOps and CI/CD 

##  Overview

In this module, we will learn about **DevOps**, **CI/CD pipelines**, and popular tools used to automate software development and deployment.

By the end of this module, we will understand:

- What is DevOps?
- Why do companies use DevOps?
- What is CI/CD?
- Difference between Continuous Integration, Continuous Delivery, and Continuous Deployment
- Popular CI/CD tools like Jenkins, GitHub Actions, GitLab CI/CD, and CircleCI


---

# 1. Introduction to DevOps

## What is DevOps?

**DevOps** is a combination of two words:

- **Development (Dev)** → Developers who write and test code
- **Operations (Ops)** → Teams who deploy and maintain applications

DevOps is a culture and set of practices that helps developers and operations teams work together to build, test, and release software faster.

### Simple Example:

Without DevOps:

```
Developer writes code
        ↓
Testing team tests manually
        ↓
Operations team deploys manually
        ↓
Release takes more time
```

With DevOps:

```
Code → Build → Test → Deploy → Monitor

(All steps are automated)
```

DevOps helps companies deliver software **faster, more reliably, and with fewer errors**.


---

# 2. Goals of DevOps

## 1. Faster Software Delivery 

DevOps uses automation to reduce the time required to build and release applications.

Example:

A company can release new features every day instead of waiting for months.


## 2. Better Collaboration 

Developers and operations teams communicate and work together.

This reduces conflicts during deployment.


## 3. Automation

Repeated tasks like:

- Testing
- Building applications
- Deployment

are automated using DevOps tools.


## 4. Improved Software Quality

Continuous testing helps find and fix bugs early.


## 5. Continuous Improvement

Monitoring user feedback helps improve applications continuously.


---

# 3. Benefits of DevOps

| Benefit | Explanation |
|---|---|
| Faster Releases | Software reaches users quickly |
| Better Quality | Automated testing reduces bugs |
| Less Manual Work | Tasks are automated |
| Improved Collaboration | Teams work together |
| Reliable Deployment | Same process is followed every time |
| Better Security | Security checks can be automated |


---

# 4. Key DevOps Practices

## 4.1 Continuous Integration (CI)

Continuous Integration means developers frequently merge their code into a shared repository.

Whenever new code is added:

1. Code is built
2. Automated tests run
3. Errors are detected early


Example:

```
Developer
    |
    ↓
Push Code to GitHub
    |
    ↓
CI Tool Runs Tests
    |
    ↓
Code Approved
```


Benefits:

- Finds bugs early
- Improves code quality
- Reduces integration problems


---

## 4.2 Continuous Delivery (CD)

Continuous Delivery automatically prepares the application for deployment.

The application is always ready to be released.

Example:

```
Code
 ↓
Build
 ↓
Test
 ↓
Ready for Production
```

A person can manually approve before releasing.


---

## 4.3 Continuous Deployment

Continuous Deployment automatically releases the application after successful testing.

Example:

```
Developer pushes code
          ↓
Automated Testing
          ↓
Application Automatically Deployed
```

No manual approval is required.


---

## 4.4 Infrastructure as Code (IaC)

Infrastructure as Code means managing servers and cloud resources using code.

Instead of manually creating servers, we write scripts.

Examples:

- Terraform
- Ansible


Advantages:

- Faster setup
- Consistent environments
- Easy management


---

## 4.5 Monitoring and Logging

After deployment, applications need monitoring.

Monitoring helps to find:

- Application errors
- Performance issues
- Security problems


Popular tools:

- Prometheus
- Grafana
- ELK Stack


---

# 5. Understanding CI/CD

## What is Continuous Integration (CI)?

CI is the practice of automatically building and testing code whenever developers make changes.

### CI Workflow:

```
Developer writes code

        ↓

Push code to repository

        ↓

CI Tool builds application

        ↓

Automated tests run

        ↓

Code is merged
```


---

# What is Continuous Delivery (CD)?

Continuous Delivery ensures that software is always ready for deployment.

The final deployment decision can be taken manually.


Example:

A company tests a new feature and keeps it ready for release after manager approval.


---

# What is Continuous Deployment?

Continuous Deployment goes one step further.

Every successful code change is automatically deployed to users.


Example:

When a developer fixes a bug:

```
Code Change
     ↓
Testing
     ↓
Automatic Deployment
     ↓
Users get the update
```


---

# 6. Difference Between CI and CD

| Continuous Integration (CI) | Continuous Delivery (CD) |
|---|---|
| Focuses on coding and testing | Focuses on releasing software |
| Developers merge code frequently | Application is kept ready for deployment |
| Finds bugs early | Makes deployment easier |


## Continuous Delivery vs Continuous Deployment

| Continuous Delivery | Continuous Deployment |
|---|---|
| Requires manual approval | Fully automatic |
| Safer approach | Faster approach |
| Human decides release time | System releases automatically |


---

# 7. Benefits of CI/CD

## Faster Development

Automation reduces development time.


## Early Bug Detection

Problems are identified before reaching users.


## Easy Deployment

The same automated process is used every time.


## Reduced Errors

Less manual work means fewer mistakes.


## Better Team Productivity

Developers focus on writing features instead of manual deployment.


---

# 8. Popular CI/CD Tools

## 8.1 Jenkins

Jenkins is an open-source automation tool used to create CI/CD pipelines.

### Jenkins Workflow:

```
Developer
    ↓
Git Repository
    ↓
Jenkins
    ↓
Build
    ↓
Testing
    ↓
Deployment
```


Features:

- Open source
- Supports many plugins
- Easy automation


---

# 8.2 GitHub Actions

GitHub Actions is a CI/CD tool provided by GitHub.

It allows developers to automate workflows directly inside GitHub.


Example:

```
Code pushed to GitHub

        ↓

GitHub Actions starts

        ↓

Runs Tests

        ↓

Deploy Application
```


Advantages:

- Easy GitHub integration
- Free for public repositories
- Supports cloud deployment


---

# 8.3 GitLab CI/CD

GitLab CI/CD is a built-in automation tool in GitLab.

It uses pipelines to automate:

- Building
- Testing
- Deployment


Pipeline:

```
Build → Test → Deploy
```


---

# 8.4 CircleCI

CircleCI is a cloud-based CI/CD platform.

Features:

- Fast execution
- Docker support
- Automated testing
- Cloud integration


---

# 9. Real-Time Example of CI/CD

Imagine an e-commerce website:

A developer adds a new payment feature.

Without CI/CD:

```
Developer writes code
↓
Manual testing
↓
Manual deployment
↓
More chances of errors
```


With CI/CD:

```
Developer pushes code
↓
CI runs tests
↓
CD deploys feature
↓
Customers receive update
```


---

# 10. DevOps Lifecycle

```
Plan
 ↓
Code
 ↓
Build
 ↓
Test
 ↓
Release
 ↓
Deploy
 ↓
Operate
 ↓
Monitor
```


---

# 11. Common DevOps Tools

| Purpose | Tools |
|---|---|
| Version Control | Git, GitHub |
| CI/CD | Jenkins, GitHub Actions, CircleCI |
| Containerization | Docker |
| Cloud | AWS, Azure |
| Monitoring | Grafana, Prometheus |
| Configuration Management | Ansible |


---

# 12. Interview Questions

### 1. What is DevOps?

DevOps is a practice that combines development and operations to improve software delivery through automation and collaboration.


### 2. What is CI/CD?

CI/CD is a process that automates building, testing, and deploying software.


### 3. Difference between Continuous Delivery and Continuous Deployment?

Continuous Delivery requires manual approval, while Continuous Deployment automatically releases changes.


### 4. Name some CI/CD tools.

Examples:

- Jenkins
- GitHub Actions
- GitLab CI/CD
- CircleCI


### 5. Why do companies use DevOps?

Companies use DevOps to deliver software faster, improve quality, and reduce deployment errors.



