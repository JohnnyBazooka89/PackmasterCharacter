package thePackmaster.cards.darksoulspack;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import thePackmaster.powers.darksoulspack.RemedyPower;
import thePackmaster.util.Wiz;

import static thePackmaster.SpireAnniversary5Mod.makeID;

public class Remedy extends AbstractDarkSoulsCard {
    public final static String ID = makeID("Remedy");
    // intellij stuff power, self, uncommon, , , , , 3,

    private static final int MAGIC = 3;
    private static final int UPGRADE_MAGIC = 2;
    private static final int MAGIC2 = 2;
    private static final int UPGRADE_MAGIC2 = 0;

    public Remedy() {
        super(ID, 1, CardType.POWER, CardRarity.UNCOMMON, CardTarget.SELF);
        baseMagicNumber = magicNumber = MAGIC;
        baseSecondMagic = secondMagic = MAGIC2;
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        Wiz.applyToSelf(new RemedyPower(p, magicNumber, secondMagic));
    }

    public void upp() {
        upgradeMagicNumber(UPGRADE_MAGIC);
        upgradeSecondMagic(UPGRADE_MAGIC2);
    }
}