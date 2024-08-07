package thePackmaster.cards.dimensiongateabstracts;

public abstract class AbstractDimensionalCardTowerTactics extends AbstractDimensionalCard {

    public AbstractDimensionalCardTowerTactics(final String cardID, final int cost, final CardRarity rarity, final CardType type, final CardTarget target) {
        super(cardID, cost, rarity, type, target, "dimension/towertactics");
    }

    public AbstractDimensionalCardTowerTactics(final String cardID, final int cost, final CardRarity rarity, final CardType type, final CardTarget target, final CardColor color) {
        super(cardID, cost, rarity, type, target, "dimension/towertactics", color);
    }

}