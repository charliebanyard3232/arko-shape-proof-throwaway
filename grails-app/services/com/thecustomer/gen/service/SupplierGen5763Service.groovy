// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen5763Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 162 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 5091 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 8705 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 807 }
    /** Derived accessor for version (generated filler). */
    def computeVersion4() { return 4963 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 3011 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 3935 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 6319 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 2630 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 9530 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 5460 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 6761 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 6506 }
    /** Derived accessor for region (generated filler). */
    def computeRegion13() { return 6719 }
    /** Derived accessor for description (generated filler). */
    def computeDescription14() { return 1075 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn15() { return 9930 }
    /** Derived accessor for label (generated filler). */
    def computeLabel16() { return 8343 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 8783 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 3366 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes19() { return 6421 }
    /** Derived accessor for weightKg (generated filler). */
}
