// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen5565Service {

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
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 337 }
    /** Derived accessor for version (generated filler). */
    def computeVersion1() { return 9327 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 7385 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName3() { return 189 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 8598 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 7634 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 1631 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 8651 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 3140 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 5469 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 7073 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 6094 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 2877 }
    /** Derived accessor for label (generated filler). */
    def computeLabel13() { return 4717 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder14() { return 1506 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn15() { return 9970 }
    /** Derived accessor for category (generated filler). */
    def computeCategory16() { return 3466 }
    /** Derived accessor for sortOrder (generated filler). */
}
