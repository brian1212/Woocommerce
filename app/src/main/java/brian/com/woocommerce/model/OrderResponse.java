package brian.com.woocommerce.model;

import java.util.List;

/**
 * Created by Brian  on 14/02/2017.
 */

public class OrderResponse {

    private int id;
    private int parent_id;
    private String status;
    private String order_key;
    private String number;
    private String currency;
    private String version;
    private boolean prices_include_tax;
    private String date_created;
    private String date_modified;
    private int customer_id;
    private String discount_total;
    private String discount_tax;
    private String shipping_total;
    private String shipping_tax;
    private String cart_tax;
    private String total;
    private String total_tax;
    private BillingBean billing;
    private ShippingBean shipping;
    private String payment_method;
    private String payment_method_title;
    private String transaction_id;
    private String customer_ip_address;
    private String customer_user_agent;
    private String created_via;
    private String customer_note;
    private String date_completed;
    private String date_paid;
    private String cart_hash;
    private LinksBean _links;
    private List<LineItemsBean> line_items;
    private List<TaxLinesBean> tax_lines;
    private List<ShippingLinesBean> shipping_lines;
    private List<?> fee_lines;
    private List<?> coupon_lines;
    private List<?> refunds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrder_key() {
        return order_key;
    }

    public void setOrder_key(String order_key) {
        this.order_key = order_key;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isPrices_include_tax() {
        return prices_include_tax;
    }

    public void setPrices_include_tax(boolean prices_include_tax) {
        this.prices_include_tax = prices_include_tax;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(String date_modified) {
        this.date_modified = date_modified;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDiscount_total() {
        return discount_total;
    }

    public void setDiscount_total(String discount_total) {
        this.discount_total = discount_total;
    }

    public String getDiscount_tax() {
        return discount_tax;
    }

    public void setDiscount_tax(String discount_tax) {
        this.discount_tax = discount_tax;
    }

    public String getShipping_total() {
        return shipping_total;
    }

    public void setShipping_total(String shipping_total) {
        this.shipping_total = shipping_total;
    }

    public String getShipping_tax() {
        return shipping_tax;
    }

    public void setShipping_tax(String shipping_tax) {
        this.shipping_tax = shipping_tax;
    }

    public String getCart_tax() {
        return cart_tax;
    }

    public void setCart_tax(String cart_tax) {
        this.cart_tax = cart_tax;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    public BillingBean getBilling() {
        return billing;
    }

    public void setBilling(BillingBean billing) {
        this.billing = billing;
    }

    public ShippingBean getShipping() {
        return shipping;
    }

    public void setShipping(ShippingBean shipping) {
        this.shipping = shipping;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method_title() {
        return payment_method_title;
    }

    public void setPayment_method_title(String payment_method_title) {
        this.payment_method_title = payment_method_title;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getCustomer_ip_address() {
        return customer_ip_address;
    }

    public void setCustomer_ip_address(String customer_ip_address) {
        this.customer_ip_address = customer_ip_address;
    }

    public String getCustomer_user_agent() {
        return customer_user_agent;
    }

    public void setCustomer_user_agent(String customer_user_agent) {
        this.customer_user_agent = customer_user_agent;
    }

    public String getCreated_via() {
        return created_via;
    }

    public void setCreated_via(String created_via) {
        this.created_via = created_via;
    }

    public String getCustomer_note() {
        return customer_note;
    }

    public void setCustomer_note(String customer_note) {
        this.customer_note = customer_note;
    }

    public String getDate_completed() {
        return date_completed;
    }

    public void setDate_completed(String date_completed) {
        this.date_completed = date_completed;
    }

    public String getDate_paid() {
        return date_paid;
    }

    public void setDate_paid(String date_paid) {
        this.date_paid = date_paid;
    }

    public String getCart_hash() {
        return cart_hash;
    }

    public void setCart_hash(String cart_hash) {
        this.cart_hash = cart_hash;
    }

    public LinksBean get_links() {
        return _links;
    }

    public void set_links(LinksBean _links) {
        this._links = _links;
    }

    public List<LineItemsBean> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItemsBean> line_items) {
        this.line_items = line_items;
    }

    public List<TaxLinesBean> getTax_lines() {
        return tax_lines;
    }

    public void setTax_lines(List<TaxLinesBean> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public List<ShippingLinesBean> getShipping_lines() {
        return shipping_lines;
    }

    public void setShipping_lines(List<ShippingLinesBean> shipping_lines) {
        this.shipping_lines = shipping_lines;
    }

    public List<?> getFee_lines() {
        return fee_lines;
    }

    public void setFee_lines(List<?> fee_lines) {
        this.fee_lines = fee_lines;
    }

    public List<?> getCoupon_lines() {
        return coupon_lines;
    }

    public void setCoupon_lines(List<?> coupon_lines) {
        this.coupon_lines = coupon_lines;
    }

    public List<?> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<?> refunds) {
        this.refunds = refunds;
    }

    public static class BillingBean {
        /**
         * first_name : John
         * last_name : Doe
         * company :
         * address_1 : 969 Market
         * address_2 :
         * city : San Francisco
         * state : CA
         * postcode : 94103
         * country : US
         * email : john.doe@example.com
         * phone : (555) 555-5555
         */

        private String first_name;
        private String last_name;
        private String company;
        private String address_1;
        private String address_2;
        private String city;
        private String state;
        private String postcode;
        private String country;
        private String email;
        private String phone;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getAddress_1() {
            return address_1;
        }

        public void setAddress_1(String address_1) {
            this.address_1 = address_1;
        }

        public String getAddress_2() {
            return address_2;
        }

        public void setAddress_2(String address_2) {
            this.address_2 = address_2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static class ShippingBean {
        /**
         * first_name : John
         * last_name : Doe
         * company :
         * address_1 : 969 Market
         * address_2 :
         * city : San Francisco
         * state : CA
         * postcode : 94103
         * country : US
         */

        private String first_name;
        private String last_name;
        private String company;
        private String address_1;
        private String address_2;
        private String city;
        private String state;
        private String postcode;
        private String country;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getAddress_1() {
            return address_1;
        }

        public void setAddress_1(String address_1) {
            this.address_1 = address_1;
        }

        public String getAddress_2() {
            return address_2;
        }

        public void setAddress_2(String address_2) {
            this.address_2 = address_2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public static class LinksBean {
        private List<SelfBean> self;
        private List<CollectionBean> collection;

        public List<SelfBean> getSelf() {
            return self;
        }

        public void setSelf(List<SelfBean> self) {
            this.self = self;
        }

        public List<CollectionBean> getCollection() {
            return collection;
        }

        public void setCollection(List<CollectionBean> collection) {
            this.collection = collection;
        }

        public static class SelfBean {
            /**
             * href : https://example.com/wp-json/wc/v1/orders/154
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class CollectionBean {
            /**
             * href : https://example.com/wp-json/wc/v1/orders
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }
    }

    public static class LineItemsBean {
        /**
         * id : 18
         * name : Woo Single #1
         * sku :
         * product_id : 93
         * variation_id : 0
         * quantity : 2
         * tax_class :
         * price : 3.00
         * subtotal : 6.00
         * subtotal_tax : 0.45
         * total : 6.00
         * total_tax : 0.45
         * taxes : [{"id":75,"total":0.45,"subtotal":0.45}]
         * meta : []
         */

        private int id;
        private String name;
        private String sku;
        private int product_id;
        private int variation_id;
        private int quantity;
        private String tax_class;
        private String price;
        private String subtotal;
        private String subtotal_tax;
        private String total;
        private String total_tax;
        private List<TaxesBean> taxes;
        private List<?> meta;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getVariation_id() {
            return variation_id;
        }

        public void setVariation_id(int variation_id) {
            this.variation_id = variation_id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getTax_class() {
            return tax_class;
        }

        public void setTax_class(String tax_class) {
            this.tax_class = tax_class;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getSubtotal() {
            return subtotal;
        }

        public void setSubtotal(String subtotal) {
            this.subtotal = subtotal;
        }

        public String getSubtotal_tax() {
            return subtotal_tax;
        }

        public void setSubtotal_tax(String subtotal_tax) {
            this.subtotal_tax = subtotal_tax;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getTotal_tax() {
            return total_tax;
        }

        public void setTotal_tax(String total_tax) {
            this.total_tax = total_tax;
        }

        public List<TaxesBean> getTaxes() {
            return taxes;
        }

        public void setTaxes(List<TaxesBean> taxes) {
            this.taxes = taxes;
        }

        public List<?> getMeta() {
            return meta;
        }

        public void setMeta(List<?> meta) {
            this.meta = meta;
        }

        public static class TaxesBean {
            /**
             * id : 75
             * total : 0.45
             * subtotal : 0.45
             */

            private int id;
            private double total;
            private double subtotal;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public double getTotal() {
                return total;
            }

            public void setTotal(double total) {
                this.total = total;
            }

            public double getSubtotal() {
                return subtotal;
            }

            public void setSubtotal(double subtotal) {
                this.subtotal = subtotal;
            }
        }
    }

    public static class TaxLinesBean {
        /**
         * id : 21
         * rate_code : US-CA-STATE TAX
         * rate_id : 75
         * label : State Tax
         * compound : false
         * tax_total : 1.95
         * shipping_tax_total : 0.00
         */

        private int id;
        private String rate_code;
        private String rate_id;
        private String label;
        private boolean compound;
        private String tax_total;
        private String shipping_tax_total;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRate_code() {
            return rate_code;
        }

        public void setRate_code(String rate_code) {
            this.rate_code = rate_code;
        }

        public String getRate_id() {
            return rate_id;
        }

        public void setRate_id(String rate_id) {
            this.rate_id = rate_id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public boolean isCompound() {
            return compound;
        }

        public void setCompound(boolean compound) {
            this.compound = compound;
        }

        public String getTax_total() {
            return tax_total;
        }

        public void setTax_total(String tax_total) {
            this.tax_total = tax_total;
        }

        public String getShipping_tax_total() {
            return shipping_tax_total;
        }

        public void setShipping_tax_total(String shipping_tax_total) {
            this.shipping_tax_total = shipping_tax_total;
        }
    }

    public static class ShippingLinesBean {
        /**
         * id : 20
         * method_title : Flat Rate
         * method_id : flat_rate
         * total : 10.00
         * total_tax : 0.00
         * taxes : []
         */

        private int id;
        private String method_title;
        private String method_id;
        private String total;
        private String total_tax;
        private List<?> taxes;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMethod_title() {
            return method_title;
        }

        public void setMethod_title(String method_title) {
            this.method_title = method_title;
        }

        public String getMethod_id() {
            return method_id;
        }

        public void setMethod_id(String method_id) {
            this.method_id = method_id;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getTotal_tax() {
            return total_tax;
        }

        public void setTotal_tax(String total_tax) {
            this.total_tax = total_tax;
        }

        public List<?> getTaxes() {
            return taxes;
        }

        public void setTaxes(List<?> taxes) {
            this.taxes = taxes;
        }
    }
}
