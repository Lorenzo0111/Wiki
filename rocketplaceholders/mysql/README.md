# MySQL

## How to synchronize placeholders across servers

### 1: Fill the connection informations form

```yaml
mysql:
  # If this is not enabled will be used local placeholders
  enabled: false
  # The main server is the server from the placeholders are copied
  main: false
  # Database information
  ip: 0.0.0.0
  port: 3306
  username: "root"
  password: "" # Leave empty if none
  database: "rocketplaceholders"
```

### 2: Choose a main server

Remember to chose a main server, all placeholders are copied from it.

See [here](https://docs.rocketplugins.space/rocketplaceholders/mysql/mysql#what-is-a-main-server).

### 3: \(Re\)Start the server



{% hint style="info" %}
See the faq for more informations
{% endhint %}

{% page-ref page="faq.md" %}



