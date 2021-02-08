# MySQL F.A.Q

### What is the difference from MySQL and YML?

With MySQL you can sync placeholders across your servers.

### What is a Main Server?

The main server is the server that put his config's placeholders in the database. The other servers will get the placeholders from the database.

{% hint style="warning" %}
Only one server can be the main server.
{% endhint %}

### Will the MySQL cause lag?

No

### If I use MySQL are the config's placeholders read?

Yes, if the server is not a main server you'll have the database's placeholders and the config's placeholders.

### How can i delete all my config's placeholders to use only database placeholders?

Just delete all placeholders

```yaml
placeholders:
  # Nothing here ツ
```



