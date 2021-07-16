# Item Condition

With this condition you can check if the player has an item in his inventory.

Set the type to [ITEM](https://rocketplaceholders.jd.rocketplugins.space/me/lorenzo0111/rocketplaceholders/creator/conditions/RequirementType.html#ITEM).

Now you have some options to set.

### Material

Material of the item. You can view a list [here](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html).

### \[Optional\] Name

Name of the item.

### \[Optional\] Lore

Lore of the item as string list.  
Example:

```yaml
lore:
    - "First line"
    - "Second line"
```

### \[Optional\] Colors

If set to true color codes like `&a` are translated and they are coloured.

Default: false



Here is a full example:

```yaml
conditions:
    itemExample:
        type: ITEM
        material: STONE
        name: "&cExample"
        lore:
            - "&aExample line"
        colors: true
        text: "Example condition text"
```



