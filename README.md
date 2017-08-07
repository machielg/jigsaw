# jigsaw
Java 9 Platform Module System (Jigsaw) sample maven project

This example project shows a basic usage of dependency design between modules based on SOLID principles, specifcally Dependency Inversion and Interface Segregation.

Modules in this project:
- client: a simple printer of customers
- client-needs: the needs (interfaces) the client needs to run
- simple-repo: a stub implemenation of client-needs

The 'app' module is the module that you run, it requires client and simple-repo.

To build run 
```mvn clean package``` from the root. 

I haven't figured out if Maven has support for module based running using the module path. 
