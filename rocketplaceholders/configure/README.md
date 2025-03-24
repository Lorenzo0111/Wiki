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
# This config has been generated with RocketPlaceholders v@version@
# RocketPlaceholders Wiki: https://docs.rocketplugins.space/rocketplaceholders

# RocketPlaceholders prefix
prefix: "&9RocketPlaceholders &8»&r"
no_permission: "&cYou do not have permission to use this command!"
debug: false

#Enable Update Message on Join. Default: true
update-message: true

mysql:
  # If this is not enabled will be used local placeholders
  enabled: false
  # The main server is the server from the placeholders are copied
  main: false
  # Database information
  ip: 0.0.0.0
  port: 3306
  username: ""
  password: ""
  database: ""

# All placeholders have been moved in the placeholders folder.
```

### Creating a custom placeholder

In order to create a custom placeholder, you need to create a new file in the `placeholders`  with the following layout:

```yaml
placeholders:
  test:
    placeholder: "test" # The placeholder will be %rp_test% ( PlaceholderAPI ) or {rp_test} ( MVdWPlaceholderAPI )
    text: "This is an example"
    conditions:
      permissionExample:
        type: PERMISSION # LIST: https://to.lorenzo0111.me/conditions
        value: "rocketplaceholder.example"
        text: "Example text with a permission condition"
      itemExample:
        type: ITEM
        material: STONE
        name: "&cExample"
        text: "Example text with a item condition"
```

### **More informations:**

{% content-ref url="custom-permissions.md" %}
[custom-permissions.md](custom-permissions.md)
{% endcontent-ref %}

## Using a JavaScript expression for the placeholder text

<pre class="language-yaml"><code class="lang-yaml"><strong>placeholders:
</strong><strong>    test: #DO NOT USE THE 0 NUMBER
</strong>    placeholder: "test" #ex "test" = %rp_test%
    text: "'Hello World' === 'Hello World' ? 'YES' : 'NO'" # This will return YES
    parsejs: true
</code></pre>

{% hint style="warning" %}
The JavaScript feature can be used with RocketPlaceholders 1.9.1+
{% endhint %}
