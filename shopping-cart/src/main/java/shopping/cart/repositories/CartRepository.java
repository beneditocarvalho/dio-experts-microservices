package shopping.cart.repositories;

import org.springframework.data.repository.CrudRepository;

import shopping.cart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
