
public class PackingReceipt implements PrintOrder
{
     
    public PackingReceipt()
    {

    }
    
     public Component printingSequence() {
        Composite packageReceipt = new Composite( "Packing Receipt" ) ;
        
        CustomBurger customBurger = new CustomBurger("1. LBB") ;
        Bacon b = new Bacon("   {{{Bacon}}}");
        Lettuce l = new Lettuce("   Lettuce");
        Tomato t = new Tomato("   Tomato");
        GrilledOnion go = new GrilledOnion("   ->|G Onion");
        GrilledJalapeno gj = new GrilledJalapeno("   ->|G Jalapeno");
        Fries f = new Fries("1. LTL CAJ");
        
        packageReceipt.addChild( customBurger );
        customBurger.addChild( l ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( go ) ;
        customBurger.addChild( gj ) ;
        customBurger.addChild( b ) ;
        packageReceipt.addChild(f);
        
        return packageReceipt;

    }
}

