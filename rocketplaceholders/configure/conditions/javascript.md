# JavaScript Condition

With this condition you can create a lot of custom conditions.

You have two variables: Player \(Rapresents the [Player](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Player.html)\) and Server \(Rapresent the [Server](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Server.html)\).

Now you can create a [javascript ](https://developer.mozilla.org/en-US/docs/Web/JavaScript)expression that needs to return a [boolean ](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean)\(true or false\).  
Just set the type to [JAVASCRIPT ](https://jd.rocketplugins.space/rocketplaceholders/me/lorenzo0111/rocketplaceholders/creator/conditions/RequirementType.html#JAVASCRIPT)and the value to the expression.

Here is an example:

```yaml
conditions:
    moneyExample:
        type: JAVASCRIPT
        value: "Player.hasPermission('example.permission');"
        text: "Example condition text"
```



