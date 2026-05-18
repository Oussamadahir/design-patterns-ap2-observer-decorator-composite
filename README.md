# Activité Pratique N°2 — Observer, Décorateur et Composite

**Design Patterns** — Master M2 SDIA II-BDCC 2025/2026
**Auteur :** Oussama Dahir

Trois patterns dans un même projet Maven, chacun avec un domaine d'application distinct.

## 1. Décorateur — Boissons
`patterns.decorator/`
Ajoute dynamiquement des suppléments (Caramel, Chocolat, Noisette) à une boisson de base (Latte, Cappuccino, Mocha) sans modifier les classes existantes.

```bash
mvn compile exec:java -Dexec.mainClass="com.oussamadahir.patterns.decorator.Main"
```

## 2. Observer — Tickers boursiers
`patterns.observer/`
Un `StockTicker` (sujet) notifie ses `StockSubscriber` (observateurs) à chaque mise à jour de prix. Chaque souscripteur réagit à sa façon (`PriceLogger`, `AlertSubscriber`, `MovingAverageSubscriber`).

```bash
mvn compile exec:java -Dexec.mainClass="com.oussamadahir.patterns.observer.Main"
```

## 3. Composite — Système de fichiers
`patterns.composite/`
Une arborescence où `Folder` peut contenir des `File` ou d'autres `Folder`. Tous implémentent `FileSystemNode` avec une méthode `size()` calculée récursivement.

```bash
mvn compile exec:java -Dexec.mainClass="com.oussamadahir.patterns.composite.Main"
```
