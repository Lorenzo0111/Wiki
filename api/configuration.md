# Configuration

## How to create a custom configuration

With **RocketAPI** you can create a **custom configuration**.

### Create a class, extends it to **Configuration** and create a **constructor**.

```java
public class ExampleConfig extends Configuration {
    public ExampleConfig(String fileName, JavaPlugin plugin) {
        super(fileName, plugin);
    }
}
```

Now save the example.yml in the jar

![Maven example](../.gitbook/assets/immagine.png)

### Save the configuration in your main class

```java
Configuration configuration = new ExampleConfig("example", this);
```

Okay, you've created your `example.yml` in your plugin folder!

### Now you can get a string from the config with

```java
// Get the string as an Object
configuration.get("example");

// Get the string as a String
configuration.getConfig().getString("example");
```

{% hint style="info" %}
Remember to create the example field in your config!
{% endhint %}



{% tabs %}
{% tab title="Main class" %}
{% file src="../.gitbook/assets/main.java" caption="Main" %}
{% endtab %}

{% tab title="ExampleConfig class" %}
{% file src="../.gitbook/assets/exampleconfig.java" caption="ExampleConfig" %}
{% endtab %}
{% endtabs %}

### 

