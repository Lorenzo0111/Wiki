# Configure

## Config:

```yaml
#
#
#    _____  _                _           _     _
#    |  __ \| |              | |         | |   | |
#    | |__) | | __ _  ___ ___| |__   ___ | | __| | ___ _ __ ___
#    |  ___/| |/ _` |/ __/ _ \ '_ \ / _ \| |/ _` |/ _ \ '__/ __|
#    | |    | | (_| | (_|  __/ | | | (_) | | (_| |  __/ |  \__ \
#    |_|    |_|\__,_|\___\___|_| |_|\___/|_|\__,_|\___|_|  |___/
#
#

# RocketPlaceholders prefix
prefix: "&c&lRocket&e&lPlaceholders &f&l»&r"

# RocketPlaceholders custom placeholders

placeholders:

  0: #DO NOT USE THE 0 NUMBER
    placeholder: "test" #ex "test" = %rp_test%
    text: "this is a test" #ex "this is a test" = out: "this is a test" (Players without permission)
    permissions:
      1:
        permission: "example.1"
        text: "this is a secret example"
```

### With this configuration you can create a public placeholder:

```yaml
  1:
    placeholder: "test"
    text: "This is a test"
```

### **More informations:**

{% page-ref page="custom-permissions.md" %}

## Using a JavaScript expression for the placeholder text

```yaml
  0: #DO NOT USE THE 0 NUMBER
    placeholder: "test" #ex "test" = %rp_test%
    text: "return 'Hello World';"
    parsejs: true
```

{% hint style="warning" %}
The JavaScript feature can be used with RocketPlaceholders 1.9.1+
{% endhint %}

