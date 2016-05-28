package id.arief.sirmi.util;

import java.awt.Color;
import javax.swing.Icon;
import jiconfont.icons.FontAwesome;
import jiconfont.icons.GoogleMaterialDesignIcons;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author arief-asus
 */
public class IconUtil {

    public IconUtil() {

    }

    public static Icon setIconTambah() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ADD_CIRCLE, 20);
        return icon;
    }

    public static Icon setIconEdit() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EDIT, 20);
        return icon;
    }

    public static Icon setIconHapus() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.REMOVE_CIRCLE, 20);
        return icon;
    }

    public static Icon setIconReset() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.REFRESH, 20);
        return icon;
    }

    public static Icon setIconKeluar() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EXIT_TO_APP, 20);
        return icon;
    }

    public static Icon setIconMasuk() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.CHECK, 20);
        return icon;
    }

    public static Icon setIconSimpan() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.FLOPPY_O, 20);
        return icon;
    }

    public static Icon setIconCari() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.SEARCH, 20);
        return icon;
    }

    public static Icon setIconError() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ERROR_OUTLINE, 20, new Color(255, 0, 0));
        return icon;
    }
    
    public static Icon setIconTable() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.TABLE, 20);
        return icon;
    }

    public static Icon setIconMobilHome() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.CAR, 100, new Color(255, 255, 255));
        return icon;
    }
    
    public static Icon setIconMobilMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.CAR, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconUserMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.USER, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconKaryawanMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.USERS, 12, new Color(0, 0, 0));
        return icon;
    }
    
     public static Icon setIconTarifMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.MONEY, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconTambahUserMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.USER_PLUS, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconUbahPasswordMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.KEY, 12, new Color(0, 0, 0));
        return icon;
    }
    
     public static Icon setIconKeluarMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.SIGN_OUT, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconTentangMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.INFO_CIRCLE, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconPenyewaanMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.CLOCK_O, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconPengembalianMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.BACKWARD, 12, new Color(0, 0, 0));
        return icon;
    }
    
    public static Icon setIconTransaksiMenu() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.BOOK, 12, new Color(0, 0, 0));
        return icon;
    }
    
     public static Icon setIconTransaksiMenuItem() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.FILE_TEXT_O, 12, new Color(0, 0, 0));
        return icon;
    }
    
     public static Icon setIconPrint() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.PRINT, 20);
        return icon;
    }
     
    
    
}
