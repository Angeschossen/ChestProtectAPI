# ChestProtectAPI - Integrate ChestProtect into your Plugin
[![](https://jitpack.io/v/Angeschossen/ChestProtectAPI.svg)](https://jitpack.io/#Angeschossen/ChestProtectAPI)


How to include the API with Maven: 
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.angeschossen</groupId>
        <artifactId>ChestProtectAPI</artifactId>
        <version>3.3.1</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

How to include the API with Gradle:
```groovy
repositories {
	maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.angeschossen:ChestProtectAPI:3.3.1"
}
```

You can also download the jar file from here: https://github.com/Angeschossen/ChestProtectAPI/releases

```
## Implementing ChestProtect
Example:

    private final ChestProtectAddon chestprotect;

    public IntegrationExample(Plugin yourPlugin) {

        // You should save this instance somewhere.
        this.chestprotect = new ChestProtectAddon(yourPlugin);
    }

    // Just a test
    void test(Location location) {

    // Get a land area from a location
    final BlockProtection protection = chestprotect.getProtection(location);
    }
```