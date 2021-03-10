# API

How to use our API

## Add the plugin as a dependency:

{% tabs %}
{% tab title="Gradle" %}
```groovy
repositories {
    maven {
        url = uri('https://repo.codemc.org/repository/maven-public/')
    }
}

dependencies {
    compileOnly 'me.Lorenzo0111:RocketPlaceholders:VERSION'
}
```
{% endtab %}

{% tab title="Maven" %}
```markup
<repositories>
    <repository>
        <id>codemc-repo</id>
        <url>https://repo.codemc.org/repository/maven-public/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>me.Lorenzo0111</groupId>
        <artifactId>RocketPlaceholders</artifactId>
        <version>VERSION</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
{% endtab %}

{% tab title="Manual" %}
Download [this ](https://github.com/Lorenzo0111/RocketPlaceholders/releases/latest)and add it as dependency.
{% endtab %}
{% endtabs %}

Replace version with [![relase](https://camo.githubusercontent.com/793e6c7dbbc730d0af432b302abb345c5d8df8f21caac8ef01e4aa4629a7eec6/68747470733a2f2f696d672e736869656c64732e696f2f6769746875622f762f72656c656173652f4c6f72656e7a6f303131312f526f636b6574506c616365686f6c64657273)](https://github.com/Lorenzo0111/RocketPlaceholders/releases/latest).

## Get the API

```java
RocketPlaceholdersAPI api = Bukkit.getServicesManager().load(RocketPlaceholdersAPI.class);
if (api != null) {
    this.getLogger().info("RocketPlaceholders hooked!");
} else {
    this.getLogger().severe("Unable to find RocketPlaceholdersAPI, disabling..");
    this.getServer().getPluginManager().disablePlugin(this);
}
```

## How to add a placeholders

#### Without permissions nodes

```java
this.getAPI().addPlaceholder(new PlaceholderBuilder("identifier", "text"));
```

#### With permissions nodes

```java
this.api.addPlaceholder(new PlaceholderBuilder(new PlaceholderBuilder("identifier", "text").createPermissionNode("permission.example", "secret text"));
```

## How to get all placeholders

#### Internal placeholders

```java
this.getAPI().getInternalPlaceholders().getStorageManager().getInternalPlaceholders();
```

#### External placeholders

```java
this.getAPI().getInternalPlaceholders().getStorageManager().getExternalPlaceholders().getHashMap();
```

{% hint style="danger" %}
Placeholders added via API won't synchronized with MySQL
{% endhint %}

## Cookbook

Click [here ](https://github.com/RocketPluginsMC/RocketPlaceholdersAPI-Cookbook)to view our cookbook.  


{% hint style="info" %}
[You can see javadocs here](https://jd.rocketplugins.space/rocketplaceholders).
{% endhint %}

