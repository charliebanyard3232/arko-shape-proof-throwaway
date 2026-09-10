// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen5337Service {

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
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 3986 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 1468 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 8221 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 6455 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 543 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 7021 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 7043 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 6471 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 5859 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 2284 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 1966 }
    /** Derived accessor for label (generated filler). */
    def computeLabel11() { return 9781 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity12() { return 8006 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 1725 }
}
