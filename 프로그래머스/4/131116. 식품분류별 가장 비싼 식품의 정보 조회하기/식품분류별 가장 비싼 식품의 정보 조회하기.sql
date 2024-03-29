select CATEGORY, PRICE as MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT
where CATEGORY regexp '과자|국|김치|식용유'
    and
      PRICE in (
        select max(PRICE)
        from FOOD_PRODUCT
        group by CATEGORY
      )
order by PRICE desc