# Kotlin ARQ

Base arquitecture created to provide an example of "Clean Architecture" applicable to a general project.

The architecture follows the clean principles:
  - Testable
  - Independent of frameworks
  - Independent of the UI
  - Independent of the database

Neverless we have tried to merge some layers of the Clean architecture in order to get a more efficient arq

Those are: 
  - Same layer for UI and Presentation
  - Same layer for Repository and Framework libraries
  
# Components

## Layers: 
  ![kotlin-arq.png](https://www.dropbox.com/s/2zsweaiesaftnwf/kotlin-arq.png?dl=0&raw=1)

## Mobile-UI Layer:
![untitled.png](https://www.dropbox.com/s/oeru2qcrljfzo5g/untitled.png?dl=0&raw=1)
The mobile-UI will include either views and presenters, using the viewmodels as presenters, so we can save the presentation layer.

Thus, the presenters will be the responsibles or abstract the neccesary information from the use case layer. And at the same time, they will be the responsibles of save the states of the views

## Domain Layer: 
![domain.png](https://www.dropbox.com/s/a7wrpzswtsrc1fy/domain.png?dl=0&raw=1)
In the domain layer we are going to find the implement the use-cases to fetch all the information from the repository layer, and modify the model with the new data. All the information modified in the model must be throuhg the use-cases.

Ideally, we will create a new use-case for any functionallity we'd like to add. Thinking efficiencily like allways, thus, we could create only a "AuthUseCase" to provide either "Login" and "Logout" method, and so on. 
 
## Repository Layer: 
![Repository.png](https://www.dropbox.com/s/gjhqezm1j5s8r65/Repository.png?dl=0&raw=1)

In the repository layer we will "fuse" the *original* Repository layer, and the Framework layer, in which should be contained libraries like Realm, Room, Retrofit, Volley, SharedPreferentes, ...

The reason to merge both layer is the co-relation that they always will have, working directly between them:
  - The API interfaces should go in the Repository layer so it knows where and how to fetch and retrieve data
  - The Framework should contain the instances of Retrofit.
  - But... what happends then with the API Implementations? They are independent from the framework, buy anyway, the must be used with Retrofit to instantiate them and process the calls to the API's.
  
That is the reason to merge those two layers in one.

# References
 -  [Boiler Plate Clean Arquitecture ](https://github.com/bufferapp/android-clean-architecture-boilerplate)
  - [Koin](https://insert-koin.io/)
  - [Android clean arquitecture with rxJava](https://hackernoon.com/android-clean-architecture-with-kotlin-rxjava-and-dagger-2-6006be2d0c02)
  - [Clean Arquitecture Kotlin](https://devexperto.com/clean-architecture-android/)
     

