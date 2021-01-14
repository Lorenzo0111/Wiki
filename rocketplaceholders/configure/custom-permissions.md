# Custom Permissions

## Creating a MultiPermission Placeholder

#### With RocketPlaceholders you can create a custom placeholder based on permissions.

```yaml
  0:
    placeholder: "example"
    text: "This is an example"
    permissions:
      1:
        permission: "example.example"
        text: "Example"
```

All players with the example.example permission can view the `Example` text, other people can view the `This is an example text`

You can create unillimted permissions with this system.

The priority is based on the order, example:

```yaml
 0:
    placeholder: "example"
    text: "This is an example"
    permissions:
      1:
        permission: "example.example"
        text: "Example"      
      2:
        permission: "example.2"
        text: "Example 2"
```

If a player has the `example.example` and the `example.2` permissions the text will be `Example` because it is on the top.

## Creating a Public Placeholder

Public Placeholders can be viewed by everyone with the same text.

You can create it just removing the permissions section:

```yaml
  0:
    placeholder: "example"
    text: "This is an example"
```

**Viewed text:** `This is an example`

