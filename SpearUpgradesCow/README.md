# SpearUpgradesCow

Spigot/Paper plugin: players get a custom spear that upgrades each time they kill a cow with it. Tiers, lunge, Sharpness, and bonus damage are configured in `src/main/resources/config.yml`.

## Requirements

- **Java 17** (matches `pom.xml`)
- **Apache Maven** 3.x

## Build the plugin JAR

From this directory (`SpearUpgradesCow`):

```bash
mvn clean package
```

The plugin jar is written to:

`target/SpearUpgradesCow-1.0.0.jar`

Copy that file into your server’s `plugins` folder and restart (or load the plugin with your server’s plugin manager).
