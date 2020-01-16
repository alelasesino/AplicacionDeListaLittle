package com.alejandro.aplicaciondelistalittle;

import com.alejandro.aplicaciondelistalittle.model.ItemProduct;

public interface ItemCustomActionListener {

    /**
     * Evento para cuando se guarda un producto personalizado
     * @param item Producto para guardar
     */
    void onSaveItemCustom(ItemProduct item);

}
