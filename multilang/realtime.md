---
description: Learn how to configure the realtime function of the plugin
---

# RealTime

### Choosing an api

You have to choose beetween two apis: google or bing.\
I personally suggest using bing because google may not work.

If you know another good api, feel free to suggest it [here](https://discord.io/RocketPlugins).

### Creating an API-Key

You only need it if you are using bing.

You can create subscribe for a free api key at [this url.](https://rapidapi.com/microsoft-azure-org-microsoft-cognitive-services/api/microsoft-translator-text/pricing)\
Then you'll have to retrieve the key at [this url](https://rapidapi.com/developer/new).

You can follow this simple gif to learn how to retrieve it:

![](https://i.imgur.com/CGHcV4T.gif)

### Should I use cache?

Of course, it will reduce lot of delay.

### My database size is too big. What should I do?

Just run /multilangadmin clearCache to clear the cache.

### Will it cause lag?

No, all tasks are executed async. But it may add a bit of delay before your message is sent(if you use the cache, it will happen only the first time you send that text)

### What will happen when I reach my quota limit?

The RealTime translation will be automatically disabled. If you found an api without this limit please suggest it [here](https://discord.io/RocketPlugins).

{% hint style="info" %}
Still need help? Join our [discord server](https://discord.io/RocketPlugins).
{% endhint %}
