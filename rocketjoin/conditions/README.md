# Conditions

The RocketJoin conditions system is similar to the RocketPlaceholders system, you can learn more about it by [clicking here](../../rocketplaceholders/configure/conditions/).

There are two types of conditions: [PERMISSION ](permission.md)and [FIRST ](first-join.md)( FirstJoin ).

### Example of configuration:

```yaml
conditions:
  example-vip:
    # type of the condition
    type: PERMISSION
    # Optional: Value
    value: "rocketjoin.vip"

    # Join and leave message
    join: "&e&l» &6&lVIP &7{player} joined!"
    leave: "&e&l» &6&lVIP &7{player} left!"
    # Sound options
    sound: true
    sound-type: "" # List: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Sound.html
    # Fireworks options
    fireworks: false
    fireworks-amount: 3
    # Commands to execute on join. Placeholders: {player}
    commands: []
```

