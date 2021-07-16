# Money Condition

{% hint style="info" %}
This condition requires [vault ](https://www.spigotmc.org/resources/34315/)and an economy plugin like [essentialsx](https://www.spigotmc.org/resources/9089/).
{% endhint %}

If you want to create a money condition you have to create a condition with the [MONEY ](https://rocketplaceholders.jd.rocketplugins.space/me/lorenzo0111/rocketplaceholders/creator/conditions/RequirementType.html#MONEY)type.

After that you have to insert a value.

{% hint style="danger" %}
Do not use number starting with `-`
{% endhint %}

Example:

```yaml
conditions:
    moneyExample:
        type: MONEY
        value: 10
        text: "Example condition text"
```



