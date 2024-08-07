package thePackmaster.cards.utilitypack;

import com.megacrit.cardcrawl.actions.common.BetterDiscardPileToHandAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import thePackmaster.SpireAnniversary5Mod;

public class Replenish extends AbstractUtilityCard {
    public static final String ID = SpireAnniversary5Mod.makeID("Replenish");
    private static final int COST = 1;
    private static final int CARDS = 2;

    public Replenish() {
        super(ID, COST, CardType.SKILL, CardRarity.UNCOMMON, CardTarget.SELF);
        this.magicNumber = this.baseMagicNumber = CARDS;
        this.exhaust = true;
    }

    @Override
    public void upp() {
        this.exhaust = false;
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster unused) {
        this.addToBot(new BetterDiscardPileToHandAction(this.magicNumber));
    }
}
