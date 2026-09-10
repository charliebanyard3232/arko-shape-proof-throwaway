// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TariffGen6344 {

    Boolean status0
    String reference1
    Date currency2
    BigDecimal label3
    String priority4
    String sortOrder5
    Date threshold6
    String currency7
    Integer weightKg8

    static constraints = {
        status0 nullable: true
        reference1 nullable: true, maxSize: 255
        currency2 nullable: true
        label3 nullable: true
        priority4 nullable: true, maxSize: 255
        sortOrder5 nullable: true, maxSize: 255
        threshold6 nullable: true
        currency7 nullable: true, maxSize: 255
        weightKg8 nullable: true
    }

    static mapping = {
        table 'reference_gen_6344'
    }

    String toString() { "TariffGen6344(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 9916 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 1360 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 2009 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 9847 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 8964 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 6096 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 9493 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 670 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 3117 }
    /** Derived accessor for active (generated filler). */
}
