/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public static Icon setIconMobil() {
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconFontSwing.buildIcon(FontAwesome.CAR, 20, new Color(255, 0, 0));
        return icon;
    }

}
