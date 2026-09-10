// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen6512 {

    String region0
    String priority1
    Date updatedOn2
    String region3
    String description4
    Integer sortOrder5
    Boolean externalId6

    static constraints = {
        region0 nullable: true, maxSize: 255
        priority1 nullable: true, maxSize: 255
        updatedOn2 nullable: true
        region3 nullable: true, maxSize: 255
        description4 nullable: true, maxSize: 255
        sortOrder5 nullable: true
        externalId6 nullable: true
    }

    static mapping = {
        table 'audit_gen_6512'
    }

    String toString() { "WarehouseGen6512(${id})" }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 7010 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 5226 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 9623 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 4227 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 9453 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 2698 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 7123 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 6174 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 8194 }
}
