### Build

```
mvn clean install
```

## Error

[ERROR] LanguageService.java:[8,38] variable languageEntity not initialized in the default constructor

## Fix

- Go to https://github.com/omidp/jakarta-data-playground/blob/main/src/test/java/org/example/LanguageService.java#L10
- uncomment the constructor
- comment the lombok RequiredArgsConstructor annotation


