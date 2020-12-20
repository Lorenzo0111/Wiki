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

  0: # Only numbers (CHANGE IT, DO NOT USE THE 0 NUMBER)
    placeholder: "test" #ex "test" = %rp_test%
    text: "this is a test" #ex "this is a test" = out: "this is a test" (Players without permission)
    permission: "example.1" #Permission to see the "text_with_permission" string
    text_with_permission: "this is a secret test!" #Only for players with the permission
```

### Examples:

Only players with the permission "example.1" can view "this is a test" text, others player can view "test" text!

```yaml
  1:
    placeholder: "test"
    text: "This is a test"
    permission: "example.1"
    text_with_permission: "this is a test"
```

All players can view "test" text!

```yaml
  1:
    placeholder: "test"
    text: "This is a test"
```



