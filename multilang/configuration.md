---
description: Learn how to configure the plugin
---

# Configuration

Every title is a config option

### prefix

It is the plugin prefix, all messages have it at their start.

### storage

* MYSQL
* FILE

If you don't have a MySQL server you can use file.

If you choose mysql you can synchronize the player language across servers.

### mysql

MySQL database settings.

{% hint style="success" %}
If you choose file you don't have to configure it
{% endhint %}

### default

Default player language

### default-base

Default language base64. See gui for more information.

{% page-ref page="gui.md" %}

### languages

List of all languages that a player can select.

#### How does the autodetect work?

You have to put a the Locale code of that language. You can view a list [here](https://minecraft.fandom.com/wiki/Language#Languages).

Example:

```yaml
languages:
  english: "en_us"
```

### strings

All translated strings

Example of a translated string:

```yaml
1:
  # This is the identifier, in this case the placeholder will be %rp_example%
  identifier: "example"
  # Default string if language is not selected or is not translated.
  default: "Hello world"
  # List of locales
  locales:
    # If the player has italian as language he will see this text
    italiano: "Ciao mondo"
```

It is simple and easy to use.

## Still confused?

[Click on this message to join on my discord support server. I will help you to configure the plugin.](https://discord.io/RocketPlugins)

