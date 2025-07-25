# Configure

The config is really easy to understand, here is a copy of the default one. For each message string such as the `message` one, you can use a list to let the plugin choose a random one each time. Here is an example:

```yaml
message: 
  - "&a{player} &7joined!"
  - "&a{player} &7appeared!"
```

## Default Config:

```yaml
#    _____            _        _          _       _
#    |  __ \          | |      | |        | |     (_)
#    | |__) |___   ___| | _____| |_       | | ___  _ _ __
#    |  _  // _ \ / __| |/ / _ \ __|  _   | |/ _ \| | '_ \
#    | | \ \ (_) | (__|   <  __/ |_  | |__| | (_) | | | | |
#    |_|  \_\___/ \___|_|\_\___|\__|  \____/ \___/|_|_| |_|

# Do not change these values
config-version: @version@
already-asked: false

# WARNING: If this plugin is running on bungeecord or velocity please read https://wiki.lorenzo0111.me/rocketjoin/bungeecord

# Start of the configuration

prefix: "&8&l»"

# Enable Update Message on Join. Default: true
update-message: true

# Placeholders: {Player} (Name) and {DisplayPlayer} (Display Name)
# PlaceholderAPI Support! Download it from tinyurl.com/PlaceholderAPI

# Join message
# Note:
# otherServerMessage is only available in a proxy( Velocity or Bungeecord)
# Additional placeholders: {server}
join:
  enabled: true
  message: "&a{player} &7joined!"
  otherServerMessage: "&a{player} &7joined &a{server}!"
  enable-title: true
  # Send a title to the player when they join the server!
  title: "&a&lWelcome {player}!"
  subtitle: "&7Welcome in ServerName Server!"

leave:
  enabled: true
  message: "&c{player} &7left!"
  otherServerMessage: "&c{player} &7left &a{server}!"

# Only available in a proxy( Velocity or Bungeecord)
# Called on server switch
# Additional placeholders: {oldServer} {newServer}
serverSwitch:
  enabled: false
  messageFrom: "&a{player} &7switched to &a{newServer}"
  messageTo: "&a{player} &7came from &a{oldServer}"

# Commands that will be executed from console when an user joins the server
# If you want to disable this just set it to []
# See https://wiki.lorenzo0111.me/rocketjoin/execute-commands for more information
# commands: []
commands: []

# If you enable hide feature people with the permission of hide-permission won't have a join message
enable-hide: false
hide-permission: "rocketjoin.silent"

# ---> Custom Conditions <---

conditions:
  example-vip:
    # Read http://wiki.lorenzo0111.me/rocketjoin/conditions for more information
    type: PERMISSION
    value: "rocketjoin.vip"

    join: "&e&l» &6&lVIP &7{player} joined!"
    leave: "&e&l» &6&lVIP &7{player} left!"
    sound: true
    sound-type: "entity.experience_orb.pickup"
    fireworks: false
    fireworks-amount: 3
    commands: []

# Use \n for a new line
# Set to "disable" to disable this feature
# welcome: "disable"
welcome: "&8&l&m===============&e  Welcome &8&l&m===============\n
    &7Welcome {player} in Minecraft Server!\n
    Use /kit default to get your kit\n"
```

