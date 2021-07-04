---
description: 'Learn how to translate entities, inventories and plugin messages'
---

# Translating

Translating entities, inventories and plugin messages is very easy!

You have to [create your translation](configuration.md) and use a special pattern.

{% hint style="success" %}
Remember to install [ProtocolLib](https://www.spigotmc.org/resources/protocollib.1997/) or the translations won't work.
{% endhint %}

## How does it work?

The plugin will handle all packets that the server sends to the client and it will translate them.

## Using the pattern

Here is an example to make it easy.

If you want to translate a menu, maybe a [DeluxeMenu](https://www.spigotmc.org/resources/deluxemenus.11734/) you just have to set the menu title to `<lang>yourIdentifier</lang>`, remember to replace `yourIdentifier` with the identifier of your translation.

You can also use more than one translation, for example if you want to create a custom plugin message like [this ](https://i.imgur.com/AYeGVi2.gif)you will have to set the plugin message to: `<lang>gamemode</lang> {0} <lang>for</lang> {1}.` This example has been made for essentials but you can adapt it for every plugin.

## Not sure about something?

Click [here](https://discord.io/RocketPlugins) to join in our discord server, I'll help you!

