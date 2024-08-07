package thePackmaster.cards.legacypack;

import com.megacrit.cardcrawl.actions.common.ObtainPotionAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.potions.PoisonPotion;
import thePackmaster.powers.legacypack.PoisonMasteryPower;
import thePackmaster.util.Wiz;

import static thePackmaster.SpireAnniversary5Mod.makeID;

public class PoisonMastery extends AbstractLegacyCard {
    public final static String ID = makeID("PoisonMastery");


    public PoisonMastery() {
        super(ID, 1, CardType.POWER, CardRarity.RARE, CardTarget.SELF);
        baseMagicNumber = magicNumber = 1;
        tags.add(CardTags.HEALING);
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        for (int i = 0; i < magicNumber; i++) {
            addToBot(new ObtainPotionAction(new PoisonPotion()));
        }

        Wiz.applyToSelf(new PoisonMasteryPower(p, 1));
    }

    public void upp() {
            upgradeMagicNumber(1);
    }
}