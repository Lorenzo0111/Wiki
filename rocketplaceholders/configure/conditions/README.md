# Custom Conditions

With RocketPlaceholders you can create custom conditions to view the text.

You can view requirement types [here](https://jd.rocketplugins.space/rocketplaceholders/me/lorenzo0111/rocketplaceholders/creator/conditions/RequirementType.html).

## Creating a condition

Here is an example to learn how to create a custom condition.

Let's add a custom permission condition on this placeholder:

```yaml
  1:
    placeholder: "test"
    text: "This is an example"
```

Add the conditions section, add the type \(PERMISSION\) and a value:

```yaml
    conditions:
      permissionExample:
        type: PERMISSION
        value: "rocketplaceholder.example"
        text: "Example condition"
```

The priority is based on the order. Here is an example:

```yaml
    conditions:
      1:
        type: PERMISSION
        value: "rocketplaceholder.example"      
        text: "First condition"
      2:
        type: PERMISSION
        value: "rocketplaceholder.example2"
        text: "Second condition"
```

If a player has the `rocketplaceholder.example` and the `rocketplaceholder.example2` permissions the text will be `First condition` because it is on the top.



You can view more informations in the single conditions pages.

