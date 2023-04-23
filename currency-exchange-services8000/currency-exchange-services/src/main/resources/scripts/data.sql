INSERT INTO currency_exchange (id, currency_from,currency_to, conversion_multiple,environment)
VALUES
    (10001, 'USD', 'INR', 65, ''),
    (10002, 'EUR', 'USD', 1.2, ''),
    (10003, 'GBP', 'USD', 1.4, '');
select *from currency_exchange
