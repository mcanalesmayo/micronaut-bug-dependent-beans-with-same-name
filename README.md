## Micronaut bug when beans from different packages have the same class name

See issue in Micronaut repo here: https://github.com/micronaut-projects/micronaut-core/issues/9526

Bug preventing app from being built. Reproduce by trying to build the app:
```sh
./gradlew clean build
```

Will yield the following unexpected error
```
> Task :main:compileJava FAILED
error: Unexpected error: Attempt to recreate a file for type com.example.$Application$MyService0$Definition$Reference
Note: Creating bean classes for 2 type elements
1 error
```

This is due to having more than 1 bean with the following conditions:
- They have the same name, but are in different packages.
- Need to be scanned by `@Import` annotation to be injected into dependent beans.

Changing any of the bean names from `MyService` to anything else will make the build pass.
